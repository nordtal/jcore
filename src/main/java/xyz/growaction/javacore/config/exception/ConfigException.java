package xyz.growaction.javacore.config.exception;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Exception that is thrown if any error occurs in the {@link xyz.growaction.javacore.config.JsonConfigLoader}
 *
 * @author Till Hoffmann / @tillhfm - 23.08.2025
 */
public class ConfigException extends Exception {
    /**
     * Creates a new {@link ConfigException}
     *
     * @param message the message of the error
     * @param cause   the {@link Throwable} that caused this {@link Exception}
     * @author Till Hoffmann / @tillhfm - 23.08.2025
     */
    public ConfigException(final @NotNull String message, final @Nullable Throwable cause) {
        super(message, cause);
    }
}
