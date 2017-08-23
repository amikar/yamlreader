import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class yamlreader {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		InputStream input = new FileInputStream(new File(args[0]));

		Yaml yaml = new Yaml(new Constructor(rule.class));

		for (Object data : yaml.loadAll(input))
		{
			  yaml = new Yaml();
		      String output = yaml.dump(data);
		      System.out.println(output);	
		      
			rule mainrule = (rule) yaml.load(output);
			
		      System.out.println(mainrule.condition);
		
		}

			
		      }

	 
}
