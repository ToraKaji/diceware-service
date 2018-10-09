package edu.cnm.deepdive.dicewareservice;

import edu.cnm.deepdive.cryptography.ArtifactGenerator;
import edu.cnm.deepdive.cryptography.PassphraseGenerator;
import edu.cnm.deepdive.cryptography.WordSource;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DicewareController {

  private ArtifactGenerator generator;

  public DicewareController(WordSource source, Random rnd) {
    generator = new PassphraseGenerator(source, rnd);

  }

  @GetMapping(path = "/diceware", produces = "text/plain")
  public String get(@RequestParam(name = "length", defaultValue = "1") int length) {
    return generator.gernerate(length);
  }

  @GetMapping(path = "/diceware", produces = "application/json")
  public String[] getJson(@RequestParam(name = "length", defaultValue = "1") int length) {
  return get(length).split("\\s+");
  }


}
