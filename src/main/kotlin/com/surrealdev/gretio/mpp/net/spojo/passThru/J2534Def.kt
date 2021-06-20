package com.surrealdev.gretio.mpp.net.spojo.passThru


object J2534Protocol {
    val J1850VPW = 0x1
    val J1850PWM = 0x2
    val ISO9141 = 0x3
    val ISO14230 = 0x4
    val CAN = 0x5
    val ISO15765 = 0x6
    val J1850VPW_PS = 0x00008000
    val J1850PWM_PS = 0x00008001
    val ISO9141_PS = 0x00008002
    val ISO14230_PS = 0x00008003
    val CAN_PS = 0x00008004
    val ISO15765_PS = 0x00008005
    val J2610_PS = 0x00008006
    val SW_ISO15765_PS = 0x00008007
    val SW_CAN_PS = 0x00008008
    val GM_UART_PS = 0x00008009
    val CAN_CH1 = 0x00009000
    val CAN_CH2 = (CAN_CH1 + 1)
    val CAN_CH128 = (CAN_CH1 + 127)
    val J1850VPW_CH1 = 0x00009080
    val J1850VPW_CH2 = (J1850VPW_CH1 + 1)
    val J1850VPW_CH128 = (J1850VPW_CH1 + 127)
    val J1850PWM_CH1 = 0x00009160
    val J1850PWM_CH2 = (J1850PWM_CH1 + 1)
    val J1850PWM_CH128 = (J1850PWM_CH1 + 127)
    val ISO9141_CH1 = 0x00009240
    val ISO9141_CH2 = (ISO9141_CH1 + 1)
    val ISO9141_CH128 = (ISO9141_CH1 + 127)
    val ISO14230_CH1 = 0x00009320
    val ISO14230_CH2 = (ISO14230_CH1 + 1)
    val ISO14230_CH128 = (ISO14230_CH1 + 127)
    val ISO15765_CH1 = 0x00009400
    val ISO15765_CH2 = (ISO15765_CH1 + 1)
    val ISO15765_CH128 = (ISO15765_CH1 + 127)
    val SW_CAN_CAN_CH1 = 0x00009480
    val SW_CAN_CAN_CH2 = (SW_CAN_CAN_CH1 + 1)
    val SW_CAN_CAN_CH128 = (SW_CAN_CAN_CH1 + 127)
    val SW_CAN_ISO15765_CH1 = 0x00009560
    val SW_CAN_ISO15765_CH2 = (SW_CAN_ISO15765_CH1 + 1)
    val SW_CAN_ISO15765_CH128 = (SW_CAN_ISO15765_CH1 + 127)
    val J2610_CH1 = 0x00009640
    val J2610_CH2 = (J2610_CH1 + 1)
    val J2610_CH128 = (J2610_CH1 + 127)
    val ANALOG_IN_CH1 = 0x0000C000
    val ANALOG_IN_CH2 = 0x0000C001
    val ANALOG_IN_CH32 = 0x0000C01F
}

object J2534Error {
    val STATUS_NOERROR = 0x00    // Function call successful.
    val ERR_NOT_SUPPORTED =
        0x01    // Device cannot support requested functionality mandated in J2534. Device is not fully SAE J2534 compliant.
    val ERR_INVALID_CHANNEL_ID = 0x02    // Invalid ChannelID value.
    val ERR_INVALID_PROTOCOL_ID =
        0x03    // Invalid or unsupported ProtocolID, or there is a resource conflict (i.e. trying to connect to multiple mutually exclusive protocols such as J1850PWM and J1850VPW, or CAN and SCI, etc.).
    val ERR_NULL_PARAMETER = 0x04    // NULL pointer supplied where a valid pointer is required.
    val ERR_INVALID_IOCTL_VALUE = 0x05    // Invalid value for Ioctl parameter.
    val ERR_INVALID_FLAGS = 0x06    // Invalid flag values.
    val ERR_FAILED = 0x07    // Undefined error, use PassThruGetLastError() for text description.
    val ERR_DEVICE_NOT_CONNECTED = 0x08    // Unable to communicate with device.
    val ERR_TIMEOUT = 0x09    // Read or write timeout:
    val ERR_INVALID_MSG = 0x0A    // Invalid message structure pointed to by pMsg.
    val ERR_INVALID_TIME_INTERVAL = 0x0B    // Invalid TimeInterval value.
    val ERR_EXCEEDED_LIMIT = 0x0C    // Exceeded maximum number of message IDs or allocated space.
    val ERR_INVALID_MSG_ID = 0x0D    // Invalid MsgID value.
    val ERR_DEVICE_IN_USE = 0x0E    // Device is currently open.
    val ERR_INVALID_IOCTL_ID = 0x0F    // Invalid IoctlID value.
    val ERR_BUFFER_EMPTY = 0x10    // Protocol message buffer empty, no messages available to read.
    val ERR_BUFFER_FULL =
        0x11    // Protocol message buffer full. All the messages specified may not have been transmitted.
    val ERR_BUFFER_OVERFLOW =
        0x12    // Indicates a buffer overflow occurred and messages were lost.
    val ERR_PIN_INVALID =
        0x13    // Invalid pin number, pin number already in use, or voltage already applied to a different pin.
    val ERR_CHANNEL_IN_USE = 0x14    // Channel number is currently connected.
    val ERR_MSG_PROTOCOL_ID =
        0x15    // Protocol type in the message does not match the protocol associated with the Channel ID
    val ERR_INVALID_FILTER_ID = 0x16    // Invalid Filter ID value.
    val ERR_NO_FLOW_CONTROL =
        0x17    // No flow control filter set or matched (for ProtocolID ISO15765 only).
    val ERR_NOT_UNIQUE =
        0x18    // A CAN ID in pPatternMsg or pFlowControlMsg matches either ID in an existing FLOW_CONTROL_FILTER
    val ERR_INVALID_BAUDRATE =
        0x19    // The desired baud rate cannot be achieved within the tolerance specified in SAE J2534-1 Section 6.5
    val ERR_INVALID_DEVICE_ID = 0x1A    // Device ID invalid.
}

object J2534ConnectFlags {
    val CAN_29BIT_ID = 0x0100
    val ISO9141_NO_CHECKSUM = 0x0200
    val CAN_ID_BOTH = 0x0800
    val ISO9141_K_LINE_ONLY = 0x1000
}

object J2534FilterType {
    val PASS_FILTER = 0x00000001
    val BLOCK_FILTER = 0x00000002
    val FLOW_CONTROL_FILTER = 0x00000003
}

object J2534ApiVer {
    val J2534_APIVER_FEBRUARY_2002 = "02.02"
    val J2534_APIVER_NOVEMBER_2004 = "04.04"
}

object J2534IoCtlId {
    val GET_CONFIG = 0x01L    // pInput = SCONFIG_LIST, pOutput = NULL
    val SET_CONFIG = 0x02L    // pInput = SCONFIG_LIST, pOutput = NULL
    val READ_VBATT = 0x03L    // pInput = NULL, pOutput = unsigned long
    val FIVE_BAUD_INIT = 0x04L    // pInput = SBYTE_ARRAY, pOutput = SBYTE_ARRAY
    val FAST_INIT = 0x05L    // pInput = PASSTHRU_MSG, pOutput = PASSTHRU_MSG
    val CLEAR_TX_BUFFER = 0x07L    // pInput = NULL, pOutput = NULL
    val CLEAR_RX_BUFFER = 0x08L    // pInput = NULL, pOutput = NULL
    val CLEAR_PERIODIC_MSGS = 0x09L    // pInput = NULL, pOutput = NULL
    val CLEAR_MSG_FILTERS = 0x0AL    // pInput = NULL, pOutput = NULL
    val CLEAR_FUNCT_MSG_LOOKUP_TABLE = 0x0BL    // pInput = NULL, pOutput = NULL
    val ADD_TO_FUNCT_MSG_LOOKUP_TABLE = 0x0CL    // pInput = SBYTE_ARRAY, pOutput = NULL
    val DELETE_FROM_FUNCT_MSG_LOOKUP_TABLE = 0x0DL    // pInput = SBYTE_ARRAY, pOutput = NULL
    val READ_PROG_VOLTAGE = 0x0EL    // pInput = NULL, pOutput = unsigned long

    //
    // J2534-2 IOCTL ID Values
    //
    val SW_CAN_HS = 0x00008000L    // pInput = NULL, pOutput = NULL
    val SW_CAN_NS = 0x00008001L    // pInput = NULL, pOutput = NULL
    val SET_POLL_RESPONSE = 0x00008002L    // pInput = SBYTE_ARRAY, pOutput = NULL
    val BECOME_MASTER = 0x00008003L    // pInput = unsigned char, pOutput = NULL
}

object J2534ConfigParameter {
    val DATA_RATE = 0x01L    // 5-500000
    val LOOPBACK = 0x03L    // 0 (OFF), 1 (ON) [0]
    val NODE_ADDRESS = 0x04L    // J1850PWM: 0x00-0xFF
    val NETWORK_LINE = 0x05L    // J1850PWM: 0 (BUS_NORMAL), 1 (BUS_PLUS), 2 (BUS_MINUS) [0]
    val P1_MIN = 0x06L    // ISO9141 or ISO14230: Not used by interface
    val P1_MAX = 0x07L    // ISO9141 or ISO14230: 0x1-0xFFFF (.5 ms per bit) [40 (20ms)]
    val P2_MIN = 0x08L    // ISO9141 or ISO14230: Not used by interface
    val P2_MAX = 0x09L    // ISO9141 or ISO14230: Not used by interface
    val P3_MIN = 0x0AL    // ISO9141 or ISO14230: 0x0-0xFFFF (.5 ms per bit) [110 (55ms)]
    val P3_MAX = 0x0BL    // ISO9141 or ISO14230: Not used by interface
    val P4_MIN = 0x0CL    // ISO9141 or ISO14230: 0x0-0xFFFF (.5 ms per bit) [10 (5ms)]
    val P4_MAX = 0x0DL    // ISO9141 or ISO14230: Not used by interface
    val W0 = 0x19L    // ISO9141: 0x0-0xFFFF (1 ms per bit) [300]
    val W1 = 0x0EL    // ISO9141 or ISO14230: 0x0-0xFFFF (1 ms per bit) [300]
    val W2 = 0x0FL    // ISO9141 or ISO14230: 0x0-0xFFFF (1 ms per bit) [20]
    val W3 = 0x10L    // ISO9141 or ISO14230: 0x0-0xFFFF (1 ms per bit) [20]
    val W4 = 0x11L    // ISO9141 or ISO14230: 0x0-0xFFFF (1 ms per bit) [50]
    val W5 = 0x12L    // ISO9141 or ISO14230: 0x0-0xFFFF (1 ms per bit) [300]
    val TIDLE = 0x13L    // ISO9141 or ISO14230: 0x0-0xFFFF (1 ms per bit) [300]
    val TINIL = 0x14L    // ISO9141 or ISO14230: 0x0-0xFFFF (1 ms per bit) [25]
    val TWUP = 0x15L    // ISO9141 or ISO14230: 0x0-0xFFFF (1 ms per bit) [50]
    val PARITY = 0x16L    // ISO9141 or ISO14230: 0 (NO_PARITY), 1 (ODD_PARITY), 2 (EVEN_PARITY) [0]
    val BIT_SAMPLE_POINT = 0x17L    // CAN: 0-100 (1% per bit) [80]
    val SYNC_JUMP_WIDTH = 0x18L    // CAN: 0-100 (1% per bit) [15]
    val T1_MAX = 0x1AL    // SCI: 0x0-0xFFFF (1 ms per bit) [20]
    val T2_MAX = 0x1BL    // SCI: 0x0-0xFFFF (1 ms per bit) [100]
    val T3_MAX = 0x24L    // SCI: 0x0-0xFFFF (1 ms per bit) [50]
    val T4_MAX = 0x1CL    // SCI: 0x0-0xFFFF (1 ms per bit) [20]
    val T5_MAX = 0x1DL    // SCI: 0x0-0xFFFF (1 ms per bit) [100]
    val ISO15765_BS = 0x1EL    // ISO15765: 0x0-0xFF [0]
    val ISO15765_STMIN = 0x1FL    // ISO15765: 0x0-0xFF [0]
    val ISO15765_BS_TX = 0x22L    // ISO15765: 0x0-0xFF,0xFFFF [0xFFFF]
    val ISO15765_STMIN_TX = 0x23L    // ISO15765: 0x0-0xFF,0xFFFF [0xFFFF]
    val DATA_BITS = 0x20L    // ISO9141 or ISO14230: 0 (8 data bits), 1 (7 data bits) [0]
    val FIVE_BAUD_MOD =
        0x21L    // ISO9141 or ISO14230: 0 (ISO 9141-2/14230-4), 1 (Inv KB2), 2 (Inv Addr), 3 (ISO 9141) [0]
    val ISO15765_WFT_MAX = 0x25L    // ISO15765: 0x0-0xFF [0]

    // J2534-2 Configuration Parameter Values
    // Default value is enclosed in square brackets "[" and "]"
    //

    val CAN_MIXED_FORMAT = 0x00008000L    // See #defines below. [0]
    val J1962_PINS =
        0x00008001L    // 0xPPSS PP: 0x00-0x10 SS: 0x00-0x10 PP!=SS, except 0x0000. Exclude pins 4, 5, and 16. [0]
    val SW_CAN_HS_DATA_RATE = 0x00008010L    // SWCAN: 5-500000 [83333]
    val SW_CAN_SPEEDCHANGE_ENABLE =
        0x00008011L    // SWCAN: 0 (DISABLE_SPDCHANGE), 1 (ENABLE_SPDCHANGE) [0]
    val SW_CAN_RES_SWITCH =
        0x00008012L    // SWCAN: 0 (DISCONNECT_RESISTOR), 1 (CONNECT_RESISTOR), 2 (AUTO_ RESISTOR) [0]
    val ACTIVE_CHANNELS = 0x00008020L    // ANALOG: 0-0xFFFFFFFF
    val SAMPLE_RATE =
        0x00008021L    // ANALOG: 0-0xFFFFFFFF [0] (high bit changes meaning from samples/sec to seconds/sample)
    val SAMPLES_PER_READING = 0x00008022L    // ANALOG: 1-0xFFFFFFFF [1]
    val READINGS_PER_MSG = 0x00008023L    // ANALOG: 1-0x00000408 (1 - 1032) [1]
    val AVERAGING_METHOD = 0x00008024L    // ANALOG: 0-0xFFFFFFFF [0]
    val SAMPLE_RESOLUTION = 0x00008025L    // ANALOG READ-ONLY: 0x1-0x20 (1 - 32)
    val INPUT_RANGE_LOW =
        0x00008026L    // ANALOG READ-ONLY: 0x80000000-0x7FFFFFFF (-2147483648-2147483647)
    val INPUT_RANGE_HIGH =
        0x00008027L    // ANALOG READ-ONLY: 0x80000000-0x7FFFFFFF (-2147483648-2147483647)
}

object J2534MixedModeFormatCanDefintions {
    val CAN_MIXED_FORMAT_OFF = 0L    // Messages will be treated as ISO 15765 ONLY.
    val CAN_MIXED_FORMAT_ON =
        1L    // Messages will be treated as either ISO 15765 or an unformatted CAN frame.
    val CAN_MIXED_FORMAT_ALL_FRAMES =
        2L    // Messages will be treated as ISO 15765, an unformatted CAN frame, or both.
}

object J2534RxStatusDefinitions {
    val SIMPLE_AVERAGE = 0x00000000        // Simple arithmetic mean
    val MAX_LIMIT_AVERAGE = 0x00000001        // Choose the biggest value
    val MIN_LIMIT_AVERAGE = 0x00000002        // Choose the lowest value
    val MEDIAN_AVERAGE = 0x00000003        // Choose arithmetic median
}

object J2534RxStatusDefintions {
    val TX_MSG_TYPE = 0x0001
    val START_OF_MESSAGE = 0x0002
    val RX_BREAK = 0x0004
    val TX_INDICATION = 0x0008
    val ISO15765_PADDING_ERROR = 0x0010
    val ISO15765_ADDR_TYPE = 0x0080
    val CAN_29BIT_ID = 0x0100

    //
    // J2534-2 RxStatus Definitions
    //
    val SW_CAN_HV_RX = 0x00010000    // SWCAN Channels Only
    val SW_CAN_HS_RX = 0x00020000    // SWCAN Channels Only
    val SW_CAN_NS_RX = 0x00040000    // SWCAN Channels Only
    val OVERFLOW_ = 0x00010000    // Analog Input Channels Only
}

object J2534TxFlags {
    val ISO15765_FRAME_PAD = 0x0040
    val ISO15765_ADDR_TYPE = 0x0080
    val CAN_29BIT_ID = 0x0100
    val WAIT_P3_MIN_ONLY = 0x0200
    val SCI_MODE = 0x400000
    val SCI_TX_VOLTAGE = 0x800000
    val SW_CAN_HV_TX = 0x00000400
}


