package eu.caffeineabusers.signaturdigitale.signature;

/**
 * This enum stores all possible outcomes of file signature verification.
 *
 * @author Tomáš Plánský
 */
public enum VerificationResult {
    VALID, INVALID, EXPIRED, NOT_SIGNED
}
