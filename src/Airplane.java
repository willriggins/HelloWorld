/**
 * Created by will on 5/16/16.
 */
public class Airplane {
    boolean isArmed;
    boolean isMilitaryOperated;
    boolean copilotRequired;
    boolean inService;
    int numberOfEngines;

    public Airplane(boolean isArmed, boolean isMilitaryOperated, boolean copilotRequired, boolean inService, int numberOfEngines) {
        this.isArmed = isArmed;
        this.isMilitaryOperated = isMilitaryOperated;
        this.copilotRequired = copilotRequired;
        this.inService = inService;
        this.numberOfEngines = numberOfEngines;
    }

    public boolean getIsArmed() {
        return isArmed;
    }

    public void setIsArmed(boolean newIsArmed) {
        isArmed = newIsArmed;
    }

    public boolean getIsMilitaryOperated() {
        return isMilitaryOperated;
    }

    public void setIsMilitaryOperated(boolean newIsMilitaryOperated) {
        isMilitaryOperated = newIsMilitaryOperated;
    }

    public boolean getCopilotRequired() {
        return copilotRequired;
    }

    public void setCopilotRequired(boolean newCopilotRequired) {
        copilotRequired = newCopilotRequired;
    }

    public boolean getInService() {
        return inService;
    }

    public void setInService(boolean newInService) {
            inService = newInService;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int newNumberOfEngines) {
        if (isSingleEngine(newNumberOfEngines)) {
            numberOfEngines = newNumberOfEngines;
        }
    }

    public static boolean isSingleEngine(int newNumberOfEngines) {
        return newNumberOfEngines == 1;
    }
}
