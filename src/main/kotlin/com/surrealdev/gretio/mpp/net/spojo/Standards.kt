package com.surrealdev.gretio.mpp.net.spojo


/**
 * This file contains agreed standards for ids, values, etc.
 */
/**
 * Type values
 */
const val MESSAGE_TYPE_VOID = -1
const val MESSAGE_TYPE_REQUEST = 1
const val MESSAGE_TYPE_RESPONSE = 2
const val MESSAGE_TYPE_UNSOLICITED = 3

/**
 * ID Values for services
 */
const val MESSAGE_ID_VOID = -1
const val MESSAGE_ID_GETINFO = 1
const val MESSAGE_ID_SUBSCRIBEINFO = 2
const val MESSAGE_ID_STATUS = 3
const val MESSAGE_ID_PROTOCOL = 4
const val MESSAGE_ID_QUERY_MODULES = 5
const val MESSAGE_ID_GET_ALL_FEATURES = 6
const val MESSAGE_ID_GET_SUPPORTED_FEATURES = 7
const val MESSAGE_ID_GET_MODULE_DTCS = 8
const val MESSAGE_ID_CLEAR_MODULE_DTCS = 9
const val MESSAGE_ID_GET_MODULE_INFO = 10
const val MESSAGE_ID_GET_MODULE_CONTROLS = 11
const val MESSAGE_ID_EXECUTE_MODULE_CONTROLS = 12
const val MESSAGE_ID_RETURN_MODULE_TO_NORMAL = 13
const val MESSAGE_ID_GET_MODULE_CONTROLS_INFO = 14
const val MESSAGE_ID_WARNING_CAUTION_ADVISORY = 15

const val MESSAGE_ID_BEGIN_RECORD = 21
const val MESSAGE_ID_END_RECORD = 22
const val MESSAGE_ID_GET_ACTIVE_RECORDS = 23


const val MESSAGE_ID_NET_JOB_STATUS = 95

const val MESSAGE_ID_AUTH = 80

const val MESSAGE_ID_BEGIN_PT_SESSION = 9000

const val MESSAGE_ID_PT_CONNECT = 9001
const val MESSAGE_ID_PT_DISCONNECT = 9002
const val MESSAGE_ID_PT_READ_MSGS = 9003
const val MESSAGE_ID_PT_START_PERIODIC = 9004
const val MESSAGE_ID_PT_STOP_PERIODIC = 9005
const val MESSAGE_ID_PT_START_MESSAGE_FILTER = 9006
const val MESSAGE_ID_PT_STOP_MESSAGE_FILTER = 9007
const val MESSAGE_ID_PT_IOCTL = 9008
const val MESSAGE_ID_PT_SET_PROG_VOLTAGE = 9009

const val MESSAGE_ID_PT_WRITE_MSGS = 9013


/**
 * General Response COdes (RCO)
 */

// This is the final sign off a server will make in a protocol before switching to a different one.
// Due to the async nature of the server, there may be remnants from the old protocol the client should handle.
const val RCO_OKAY_SWITCHING_PROTOCOLS = 101


// SUCCESS CODES

const val RCO_OKAY = 200

// Request sucessfully recieved, but will take too long.
// Norm is to retry in 1 second.
const val RCO_OKAY_PENDING = 201

// Request sucessfully recieved, but cannot be fullfilled.
// Example would be if client requests PID 45, but PID 45 does
const val RCO_OKAY_NO_CONTENT = 204

// Request sucessfully recieved, but has only been partially fulfilled.
const val RCO_OKAY_PARTIAL_CONENT = 214

// When a service  is completely not supported.
const val RCO_UNKNOWN_OR_NOT_IMPLEMENTED_SERVICE = 404


// Service request has bad or missing arguments.
const val RCO_MISSING_OR_INVALID_ARGUMENTS = 422

// Service is locked for some other usage.
const val RCO_SERVICE_LOCKED = 423


// Server is aware of service. But does not have the service implemented.
const val RCO_UNSUPPORTED_SERVICE = 501

