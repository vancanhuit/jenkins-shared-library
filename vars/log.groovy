import static common.AnsiColor.*

void info(String message) {
    echo "${ANSI_INFO}INFO: ${message}${ANSI_OFF}"
}

void warn(String message) {
    echo "${ANSI_WARN}WARNING: ${message}${ANSI_OFF}"
}

void error(String message) {
    echo "${ANSI_ERROR}ERROR: ${message}${ANSI_OFF}"
}
