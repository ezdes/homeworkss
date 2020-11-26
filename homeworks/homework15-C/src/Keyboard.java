public class Keyboard {
    String[] keyboardLayout;
    boolean hasBacklight;
    boolean hasAdditionalNumbers;

    public Keyboard() {
    }

    public Keyboard(String[] keyboardLayout, boolean hasBacklight, boolean hasAdditionalNumbers) {
        this.keyboardLayout = keyboardLayout;
        this.hasBacklight = hasBacklight;
        this.hasAdditionalNumbers = hasAdditionalNumbers;
    }

    public String[] getKeyboardLayout() {
        return keyboardLayout;
    }

    public void setKeyboardLayout(String[] keyboardLayout) {
        this.keyboardLayout = keyboardLayout;
    }

    public boolean isHasBacklight() {
        return hasBacklight;
    }

    public void setHasBacklight(boolean hasBacklight) {
        this.hasBacklight = hasBacklight;
    }

    public boolean isHasAdditionalNumbers() {
        return hasAdditionalNumbers;
    }

    public void setHasAdditionalNumbers(boolean hasAdditionalNumbers) {
        this.hasAdditionalNumbers = hasAdditionalNumbers;
    }
}
