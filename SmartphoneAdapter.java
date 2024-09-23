package AdapterPattern;

public class SmartphoneAdapter implements PowerOutlet
{
    private SmartphoneAdapter smartphoneAdapter;

    public void SmartphoneAdapter(SmartphoneAdapter smartphoneAdapter)
    {
        this.smartphoneAdapter = smartphoneAdapter;
    }

    @Override
    public void plugIn()
    {
        smartphoneAdapter.plugIn();
    }
}
