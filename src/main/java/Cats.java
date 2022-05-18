import com.fasterxml.jackson.annotation.JsonProperty;

public class Cats {
    private String id;
    private String text;
    private String type;
    private String user;
    private int upvotes;


    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public int getUpvotes() {
        return upvotes;
    }


    @Override
    public String toString() {
        return "{ id: " + id + "\n" + "text: " + text + "\n" + "type: " + type + "\n" +
                "user: " + user + "\n" + "upvotes: " + upvotes + "}" + "\n";

    }

}

