
## Gretio Web API Data Formats
This repository contains the data contracts used to communicate with Gretio's web socket server.

Usage.

## 1. First download Gretio
- https://play.google.com/store/apps/details?id=com.surrealdev.max&hl=en_US&gl=US

## 2. Connect and Authenticate with Gretio.
- Gretio uses zeroConf (Apple Bonjour, NDS) to
  discover new services. Its id is "_gretiowebservice._tcp".
  Optionally you may listen for the "com.surreal.gretio.SERVER_STARTED" broadcast
  which will contain a needed "addr" and "port" field. The service name is "com.surrealdev.gretio.androidserver.service.ScapiService" and can be started manually if need be.
- Gretio Uses HTTPS so you will need to configure your security settings appropiately. For the initial connection you may accept
  any certificate. Doing this is vulnerable to some targeted MITM attacks.
  - After you have found the server you can open a web socket conenction to the url
  wss:/\$address:\$port/ws. The default port is 57039 however other ports will be chosen if its taken. Only hard code the port for testing.
##  3. Data format
- The web socket will send json packages. There are 3 types of messages
    - val MESSAGE_TYPE_REQUEST = 1
    - val MESSAGE_TYPE_RESPONSE = 2
    - val MESSAGE_TYPE_UNSOLICITED = 3
      - Request and Response are almost 1:1 with a tradditional "HTTP over Websocket" request/response system. The third unsolicited type is used for sending data from server to client without a request. A response is never sent without a request. And you can use this to form a request -> response system without keeping state.
      - The standard request -> response system is limited to 1 request at a time. Otherwise, responses become ambiguous.
      Using "cseq" will allow you to send requests in bulk and differentiate the results later on.
- All messages will contain an "id" and "t" field. Where id is the message id, and t is the message type. They may also have a third field "cseq". You can send any cseq you want in a request. The corresponding response will repeat the same cseq. As convention you should just start at 0 and increment for every request. Responses will also have an addition "rco" field for a response code.
- All messages are json encoded. So an auth request may look like
- `{"token":"MyTokenIsCool","cseq":1,"t":1,"id":80}`
## 4. Authorize with Gretio
    - Gretio obviously requires authorization. In the end this will be a simple "API Token", a string which you keep in your app for future use. You should store this token alongside the public key of the server.
    1. Send auth request. i.e.  `{"token":"Anything","requestNewToken":true,"t":1,"id":80,"rco":200}`
    2. Receive the challenge
     `{"authResult":false,"challengeCode":"123456","t":2,"id":80,"rco":200}`
     3. Prompt your user to enter the challenge code **in the Gretio App**.  Once done you will get back a unsolicited message.
     `{"authResult":true,"token":"YOURNEWTOKENSAVETHIS","t":2,"id":80,"rco":200}`
     4. Save this token for future use. You cannot get it back. This is the only time the server will give you the token.
##  5. Working with Gretio
* We can now start making general calls. If you are familiar with OBD2 you may know about PIDS. Maybe PID 0x11 is Engine Speed. These sort of numbers have no meaning in Gretio. Gretio gives a UUID for each PID which you can then request later on. These '**pids**' are known as '**Features**'. There are useful end points for working with the features including GetAllFeaturesRequest (get all features). And GetAllSupportedRequest (only those supported on currently connected vehicle). Each features is described as follows:
- `id: Long` The UUID of the feature
- `desc: String` Human readable description if exists
- `target: String`Target module (i.e. ECM)
- `units String` Units (i.e. RPM, Degrees celsius)
- `short: String`Short name (i.e. Engine Speed may be ESS)
- `long: String` Long Name. The full feature name (i.e. Engine Speed)

* In classic OBD2 you generally make a request for a PID and receive a single instance of this. This is extremely slow. Instead use a SubscribeRequest which controls a subscription to a feature.
* Depending on the context, each pid will refresh somewhere between 5 and 20 times a second. This holds true even for multiple PIDs. So if you subscribe to 20 pids then you will have a combined rate of 400 updates/s. This is possible as Gretio implements UDS (Unified Diagnostic Services). Which is significantly faster than standard OBD2.
 