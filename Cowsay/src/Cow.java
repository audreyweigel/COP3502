public class Cow {
    protected String name;
    protected String image;

    public Cow(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image = image;
    }
}