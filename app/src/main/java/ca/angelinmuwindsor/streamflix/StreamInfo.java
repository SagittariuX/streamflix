package ca.angelinmuwindsor.streamflix;

public class StreamInfo {
    private String streamTitle;
    private String streamDescription;
    private String streamId = "";

    public StreamInfo() {
        //Empty constructor is needed for firebase
    }

    public StreamInfo(String streamTitle, String streamDescription) {
        this.streamTitle = streamTitle;
        this.streamDescription = streamDescription;
    }

    public String getStreamTitle() {
        return streamTitle;
    }

    public String getStreamDescription() {
        return streamDescription;
    }

    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }
}
