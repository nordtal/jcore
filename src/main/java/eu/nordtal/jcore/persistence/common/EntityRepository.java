package eu.nordtal.jcore.persistence.common;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * This class specifies database actions that should be available for all database entities of this project
 *
 * @param <T> the class type of the entity the repository is handling
 * @author Till Hoffmann / @tillhfm - 18.04.2025
 */
public interface EntityRepository<T> {

    /**
     * Creates or updates an entity to the database
     *
     * @param entity the entity of type {@link T} to be saved to the database
     * @return the saved entity of type {@link T}
     * @author Till Hoffmann / @tillhfm - 18.04.2025
     */
    @NotNull T save(@NotNull final T entity);

    /**
     * Finds the first entity of type {@link T} from the database by entry field name and value
     *
     * @param field the name of the field to filter for
     * @param value the value of the field to filter for
     * @return the first entity of type {@link T} or {@code null} if none was found
     * @author Till Hoffmann / @tillhfm - 18.04.2025
     */
    @Nullable T findFirst(@NotNull final String field, @Nullable final Object value);

    /**
     * Finds the first entity of type {@link T} from the database by entry id field and value
     *
     * @param value the value of the field to filter for
     * @return the first entity of type {@link T} or {@code null} if none was found
     * @author Till Hoffmann / @tillhfm - 18.04.2025
     */
    @Nullable T findFirstById(@Nullable final Object value);

    /**
     * Finds all entities of type {@link T} from the database by entry field name and value
     *
     * @param field the name of the field to filter for
     * @param value the value of the field to filter for
     * @return all entities of type {@link T} contained in a {@link List} or an empty {@link List} if none were found
     * @author Till Hoffmann / @tillhfm - 18.04.2025
     */
    @NotNull List<T> findAll(@NotNull final String field, @Nullable final Object value);

    /**
     * Finds all entities of type {@link T} from the database
     *
     * @return all entities of type {@link T} contained in a {@link List} or an empty {@link List} if none were found
     * @author Till Hoffmann / @tillhfm - 18.04.2025
     */
    @NotNull List<T> all();

    /**
     * Deletes an entity of type {@link T} from the database
     *
     * @param entity the entity of type {@link T} to be deleted
     * @author Till Hoffmann / @tillhfm - 18.04.2025
     */
    void delete(@NotNull final T entity);

}