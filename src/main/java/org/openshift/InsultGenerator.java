package org.openshift;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;
import java.util.Random;
import java.util.logging.Logger;

public class InsultGenerator {
    private static final Logger LOGGER = Logger.getLogger(org.openshift.InsultGenerator.class.getName());
    public String generateInsult() {
        String words[][] = {{"Artless", "Bawdy", "Beslubbering"}, {"Base-court", "Bat-fowling", "Beef-witted"}, {"Apple-john", "Baggage", "Barnacle"}};
        String vowels = "AEIOU";
        String article = "an";
        String firstAdjective = words[0][new Random().nextInt(words[0].length)];
        String secondAdjective = words[1][new Random().nextInt(words[1].length)];
        String noun = words[2][new Random().nextInt(words[2].length)];
        if (vowels.indexOf(firstAdjective.charAt(0)) == -1) {
            article = "a";
        }
        String insult = String.format("Thou art %s %s %s %s!", article, firstAdjective, secondAdjective, noun);
        LOGGER.info("Returning insult " + insult);
        return insult;
    }
}
