import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Comparator;
import java.util.LinkedHashMap;
public class HostingService {
    public static void main(String[]args){
        // List<Hosting> myHosting = new ArrayList<>();
        // myHosting.add(new Hosting(1, "Chelsea.com", 12345));
        // myHosting.add(new Hosting(2, "ManUtd.com", 23456));
        // myHosting.add(new Hosting(8, "ManUtd.com", 24456));
        // myHosting.add(new Hosting(3, "Arsenal.com", 45578));
        // myHosting.add(new Hosting(4, "Brentford.com", 89000));

        List<Hosting> myHosting =  Stream.of(
            new Hosting(1, "Chelsea.com", 12345),
        new Hosting(2, "ManUtd.com", 23456),
        new Hosting(8, "ManUtd.com", 24456),
       new Hosting(3, "Arsenal.com", 45578),
        new Hosting(4, "Brentford.com", 89000)
        ).collect(Collectors.toList());
        Map<Integer, String> result = myHosting.stream()
                                                .collect(Collectors.toMap(Hosting::getId, Hosting::getName));
                            System.out.println(result); //
            
        Map<String, Long> hostingMap = myHosting.stream()
                                                .collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites,(oldValue,newValue)->newValue));
        Map<String, Long> filteredResult = hostingMap.entrySet().stream().filter(x -> x.getValue() > 12345)
                                                 .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue())); 
        // Map<String, Long> hostingMap = myHosting.stream()
        //                                         .sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
        //                                         .collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites,(oldValue,newValue)->newValue, LinkedHashMap::new));
                                                
                                     System.out.println(filteredResult);

                                        
    }
}
