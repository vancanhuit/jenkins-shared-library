import static common.AnsiColor.*

void info(String message) {
    echo "${ANSI_INFO}${message}${ANSI_OFF}"
}

void warn(String message) {
    echo "${ANSI_WARN}${message}${ANSI_OFF}"
}

void error(String message) {
    echo "${ANSI_ERROR}${message}${ANSI_OFF}"
}
