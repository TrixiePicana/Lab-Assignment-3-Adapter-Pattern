package AdapterPattern;

public class LaptopAdapter implements PowerOutlet
{
    private LaptopAdapter laptopAdapter;

    public LaptopAdapter(LaptopAdapter laptopAdapter)
    {
        this.laptopAdapter = laptopAdapter;
    }

    @Override
    public void plugIn()
    {
        laptopAdapter.plugIn();
    }
}
