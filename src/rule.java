import java.util.List;

public class rule {
    public String name; 
    public String entity; 
    public String group;
    public String aggregation;
    public List<Conditions> condition;
    public Metadata metadata ;
    
 
    public String toString() {
		return "name:" + name + ",entity:" + entity+ ",group:" + group + ",aggregation:" + aggregation ;
	}
   
}