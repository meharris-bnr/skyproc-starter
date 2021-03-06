package skyprocstarter;

import skyproc.SkyProcSave;

/**
 * @author Justin Swanson
 */
public class YourSaveFile extends SkyProcSave {

    @Override
    protected void initSettings() {
        Add(
            Settings.IMPORT_AT_START, // the setting,
            true, // default value
            false // 'true' if changing it means a new patch should be made
        );
    }

    @Override
    protected void initHelp() {

        helpInfo.put(Settings.IMPORT_AT_START,
                "If enabled, the program will begin importing your mods when the program starts.\n\n"
                        + "If turned off, the program will wait until it is necessary before importing.\n\n"
                        + "NOTE: This setting will not take effect until the next time the program is run.\n\n"
                        + "Benefits:\n"
                        + "- Faster patching when you close the program.\n"
                        + "- More information displayed in GUI, as it will have access to the records from your mods."
                        + "\n\n"
                        + "Downsides:\n"
                        + "- Having this on might make the GUI respond sluggishly while it processes in the "
                        + "background.");

        helpInfo.put(Settings.OTHER_SETTINGS,
                "These are other settings related to this patcher program.");
    }

    // Note that some settings just have help info, and no actual values in
    // initSettings().
    public enum Settings {
        IMPORT_AT_START,
        OTHER_SETTINGS
    }
}
