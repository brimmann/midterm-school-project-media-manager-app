class LimitExceedException extends Exception 
{
    private Strings details;
    LimitExceedException(String a)
    {
	details = a;
    }
    
    public String toString()
    {
	return "LimitExceedException[" + details + "]";
    }
    
    Mp3Song getSongForPlayer(int i) throws EmptyTrackException
    {
	if(i > top) throw EmptyTrackException;
	else return mp3Songs[i];
    }
    
    Mp3Song getSongForPlayer(int i) throws EmptyTrackException
    {
	if(i > top) throw EmptyTrackException;
	else return mp3Songs[i];
    }
}
