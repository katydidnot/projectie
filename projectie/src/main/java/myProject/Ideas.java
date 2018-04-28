package myProject;

public class Ideas
{
    private String ideaDetail;
    public Ideas (String ideaDetail)
    {
        this.ideaDetail =ideaDetail;
    }

    public void setIdea(String ideaDetail)

    {
        this.ideaDetail = ideaDetail;
    }
    public String getIdea()
    {
        return ideaDetail;
    }

    @Override
    public String toString()
    {
        return String.format(ideaDetail);
    }
}
