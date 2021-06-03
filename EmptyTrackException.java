class EmptyTrackException
{
    private Strings details;
    EmptyTrackException(String a)
    {
	details = a;
    }
    
    public String toString()
    {
	return "EmptyTrackException[" + details + "]";
    }
}
