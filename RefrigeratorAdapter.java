package AdapterPattern;

public class RefrigeratorAdapter implements PowerOutlet
{
    private RefrigeratorAdapter refrigeratorAdapter;

    public RefrigeratorAdapter (RefrigeratorAdapter refrigeratorAdapter)
    {
        this.refrigeratorAdapter = refrigeratorAdapter;
    }

    @Override
    public void plugIn()
    {
        refrigeratorAdapter.plugIn();
    }
}
