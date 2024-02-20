import java.util.*;

public class Repository {
    static Set<Notebook> createNotebooksSet() {
        Map<String, Integer> processors = new TreeMap<>();
        processors.put("Intel Core i3-1005G1", 7000);
        processors.put("AMD Ryzen 5 3500U", 8000);
        processors.put("Intel Core i5-1035G1", 9000);
        processors.put("AMD Ryzen 7 3700U", 11000);
        processors.put("Intel Core i7-1065G7", 14000);
        processors.put("AMD Ryzen 9 4900HS", 23000);
        processors.put("Intel Core i9-10980HK", 28000);
        processors.put("AMD Ryzen 3 3200U", 6000);
        processors.put("Intel Core m3-8100Y", 5000);
        processors.put("Qualcomm Snapdragon 8cx", 11000);

        Map<String, Integer> rams = new LinkedHashMap<>();
        rams.put("8GB", 4000);
        rams.put("16GB", 8000);
        rams.put("32GB", 16000);
        rams.put("64GB", 32000);
        rams.put("128GB", 64000);

        Map<String, Integer> hardDrives = new LinkedHashMap<>();
        hardDrives.put("500GB", 4000);
        hardDrives.put("1TB", 9000);
        hardDrives.put("2TB", 14000);

        Map<String, Integer> graphicsProcessors = new TreeMap<>();
        graphicsProcessors.put("NVIDIA GeForce GTX 1660Ti 6GB", 23000);
        graphicsProcessors.put("AMD Radeon RX 5700XT 8GB", 28000);
        graphicsProcessors.put("NVIDIA GeForce RTX 2070SUPER 8GB", 33000);
        graphicsProcessors.put("AMD Radeon RX 5600XT 6GB", 18000);
        graphicsProcessors.put("NVIDIA GeForce RTX 2080Ti 11GB", 55000);

        Map<String, Integer> displaySizes = new LinkedHashMap<>();
        displaySizes.put("13.3\"", 25000);
        displaySizes.put("14.0\"", 30000);
        displaySizes.put("15.6\"", 35000);
        displaySizes.put("17.3\"", 40000);
        displaySizes.put("12.5\"", 20000);

        Set<Notebook> notebooks = new HashSet<>();
        for (int i = 0; i < 100; i++) {

            int price = 0;

            Random r = new Random();

            int randIndex = r.nextInt(processors.size());
            String processor = (String) processors.keySet().toArray()[randIndex];
            price += processors.get(processor);

            randIndex = r.nextInt(rams.size());
            String ram = (String) rams.keySet().toArray()[randIndex];
            price += rams.get(ram);

            randIndex = r.nextInt(hardDrives.size());
            String hardDrive = (String) hardDrives.keySet().toArray()[randIndex];
            price += hardDrives.get(hardDrive);

            randIndex = r.nextInt(graphicsProcessors.size());
            String graphicsProcessor = (String) graphicsProcessors.keySet().toArray()[randIndex];
            price += graphicsProcessors.get(graphicsProcessor);

            randIndex = r.nextInt(displaySizes.size());
            String displaySize = (String) displaySizes.keySet().toArray()[randIndex];
            price += displaySizes.get(displaySize);

            notebooks.add(new Notebook(processor, ram, hardDrive, graphicsProcessor,
                    displaySize, price));
        }
        return notebooks;
    }
}
