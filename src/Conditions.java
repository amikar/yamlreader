public class Conditions {
    public String conditionname;
    public String metric;
    public String value;
    public String duration;
    public String evaluate;
    public String aggregation;
    public Tags tags;

    public String toString() {
		return "conditionname:" +conditionname + ",Tags:" + tags + ",metric:" + metric+ ",value:" + value + ",duration:" + duration+ ",evaluate:" + evaluate+ ",aggregation:" + aggregation ;
	}
    }
