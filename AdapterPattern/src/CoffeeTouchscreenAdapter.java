public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    private OldCoffeeMachine mOldVendingMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldVendingMachine) {
        mOldVendingMachine = oldVendingMachine;
    }

    @Override
    public void chooseFirstSelection() {
        mOldVendingMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        mOldVendingMachine.selectB();
    }
}