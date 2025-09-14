package eu.nordtal.jcore.config;

/**
 * This class is currently just a reservation for possible future features.
 * For now, all functionality regarding json config files is handled by {@link JsonConfigLoader}
 *
 * @see JsonConfigLoader
 * @author Till Hoffmann / @tillhfm - 15.04.2025
 */
public abstract class JsonConfig {

    /**
     * No-args-constructor
     * @author Till Hoffmann / @tillhfm - 23.08.2025
     */
    public JsonConfig() {}

    /**
     * Method that is run before the config is saved
     * @author Till Hoffmann / @tillhfm - 23.08.2025
     */
    protected void preSave() {}

    /**
     * Method that is run after the config is loaded
     * @author Till Hoffmann / @tillhfm - 23.08.2025
     */
    protected void postLoad() {}

}
