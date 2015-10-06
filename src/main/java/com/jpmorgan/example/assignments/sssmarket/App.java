package com.jpmorgan.example.assignments.sssmarket;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class App 
{
	private static Log log = LogFactory.getLog(App.class);
	
    @Bean
    Map<String, Stock> Db() {
        HashMap<String, Stock> db = new HashMap<String, Stock>();
        db.put("TEA", new Stock("TEA", "Common", 0.0, 0.0, 100.0));
        db.put("POP", new Stock("POP", "Common", 8.0, 0.0, 100.0));
        db.put("ALE", new Stock("ALE", "Common", 23.0, 0.0, 60.0));
        db.put("GIN", new Stock("GIN", "Preferred", 8.0, 0.2, 100.0));
        db.put("JOE", new Stock("JOE", "Common", 13.0, 0.0, 250.0));
        return db;
    }

    public static void main( String[] args )
    {
        try {
            ApplicationContext context = 
                    new AnnotationConfigApplicationContext(App.class);
            
            @SuppressWarnings("unchecked")
    		Map<String, Stock> db = context.getBean("Db", Map.class);
            for (String stock: db.keySet()) {
            	log.debug( stock + " dividend: " + db.get(stock).dividend(9.1));
            	log.debug( stock + " P/E Ratio: " + db.get(stock).PERatio(9.1));
            }
            
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
    }
}
