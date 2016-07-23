package teammates.common.util;

/**
 * The type object that defines an email based on its purpose.
 */
public enum EmailType {
    
    FEEDBACK_OPENING("TEAMMATES: Feedback session now open [Course: %s][Feedback Session: %s]"),
    FEEDBACK_SESSION_REMINDER("TEAMMATES: Feedback session reminder [Course: %s][Feedback Session: %s]"),
    FEEDBACK_CLOSING("TEAMMATES: Feedback session closing soon [Course: %s][Feedback Session: %s]"),
    FEEDBACK_PUBLISHED("TEAMMATES: Feedback session results published [Course: %s][Feedback Session: %s]"),
    FEEDBACK_UNPUBLISHED("TEAMMATES: Feedback session results unpublished [Course: %s][Feedback Session: %s]"),
    PENDING_COMMENT_CLEARED("TEAMMATES: You have new comments for course [%s][Course ID: %s]"),
    NEW_INSTRUCTOR_ACCOUNT("TEAMMATES: Welcome to TEAMMATES! %s"),
    STUDENT_COURSE_JOIN("TEAMMATES: Invitation to join course [%s][Course ID: %s]"),
    STUDENT_COURSE_REJOIN_AFTER_GOOGLE_ID_RESET("TEAMMATES: Your account has been reset for course [%s][Course ID: %s]"),
    INSTRUCTOR_COURSE_JOIN("TEAMMATES: Invitation to join course as an instructor [%s][Course ID: %s]"),
    ADMIN_SYSTEM_ERROR("TEAMMATES (%s): New System Exception: %s"),
    SEVERE_LOGS_COMPILATION("TEAMMATES (%s): Severe Error Logs Compilation");
    
    private final String subject;
    
    EmailType(String subject) {
        this.subject = subject;
    }
    
    /**
     * Gets the subject heading of this email type.
     */
    public String getSubject() {
        return subject;
    }
    
}
