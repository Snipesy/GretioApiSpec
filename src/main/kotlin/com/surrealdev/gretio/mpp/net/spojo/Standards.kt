package com.surrealdev.gretio.mpp.net.spojo


/**
 * This file contains agreed standards for ids, values, etc.
 */
/**
 * Type values
 */
val MESSAGE_TYPE_VOID = -1
val MESSAGE_TYPE_REQUEST = 1
val MESSAGE_TYPE_RESPONSE = 2
val MESSAGE_TYPE_UNSOLICITED = 3

/**
 * ID Values for services
 */
val MESSAGE_ID_VOID = -1
val MESSAGE_ID_GETINFO = 1
val MESSAGE_ID_SUBSCRIBEINFO = 2
val MESSAGE_ID_STATUS = 3
val MESSAGE_ID_PROTOCOL = 4
val MESSAGE_ID_QUERY_MODULES = 5
val MESSAGE_ID_GET_ALL_FEATURES = 6
val MESSAGE_ID_GET_SUPPORTED_FEATURES = 7
val MESSAGE_ID_GET_MODULE_DTCS = 8
val MESSAGE_ID_CLEAR_MODULE_DTCS = 9
val MESSAGE_ID_GET_MODULE_INFO = 10
val MESSAGE_ID_GET_MODULE_CONTROLS = 11
val MESSAGE_ID_EXECUTE_MODULE_CONTROLS = 12
val MESSAGE_ID_RETURN_MODULE_TO_NORMAL = 13
val MESSAGE_ID_GET_MODULE_CONTROLS_INFO = 14

val MESSAGE_ID_BEGIN_RECORD = 21
val MESSAGE_ID_END_RECORD = 22
val MESSAGE_ID_GET_ACTIVE_RECORDS = 23


val MESSAGE_ID_NET_JOB_STATUS = 95

val MESSAGE_ID_AUTH = 80

val MESSAGE_ID_BEGIN_PT_SESSION = 9000

val MESSAGE_ID_PT_CONNECT = 9001
val MESSAGE_ID_PT_DISCONNECT = 9002
val MESSAGE_ID_PT_READ_MSGS = 9003
val MESSAGE_ID_PT_START_PERIODIC = 9004
val MESSAGE_ID_PT_STOP_PERIODIC = 9005
val MESSAGE_ID_PT_START_MESSAGE_FILTER = 9006
val MESSAGE_ID_PT_STOP_MESSAGE_FILTER = 9007
val MESSAGE_ID_PT_IOCTL = 9008
val MESSAGE_ID_PT_SET_PROG_VOLTAGE = 9009

val MESSAGE_ID_PT_WRITE_MSGS = 9013


/**
 * General Response COdes (RCO)
 */

// This is the final sign off a server will make in a protocol before switching to a different one.
// Due to the async nature of the server, there may be remnants from the old protocol the client should handle.
val RCO_OKAY_SWITCHING_PROTOCOLS = 101


// SUCCESS CODES

val RCO_OKAY = 200

// Request sucessfully recieved, but will take too long.
// Norm is to retry in 1 second.
val RCO_OKAY_PENDING = 201

// Request sucessfully recieved, but cannot be fullfilled.
// Example would be if client requests PID 45, but PID 45 does
val RCO_OKAY_NO_CONTENT = 204

// Request sucessfully recieved, but has only been partially fulfilled.
val RCO_OKAY_PARTIAL_CONENT = 214

// When a service  is completely not supported.
val RCO_UNKNOWN_OR_NOT_IMPLEMENTED_SERVICE = 404


// Service request has bad or missing arguments.
val RCO_MISSING_OR_INVALID_ARGUMENTS = 422

// Service is locked for some other usage.
val RCO_SERVICE_LOCKED = 423


// Server is aware of service. But does not have the service implemented.
val RCO_UNSUPPORTED_SERVICE = 501

