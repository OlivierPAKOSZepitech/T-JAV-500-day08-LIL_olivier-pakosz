package Factory;

import java.util.ArrayList;
import java.util.List;

class Factory {
    public Toy create(String toyType) throws NoSuchToyException {
        if ("teddy".equals(toyType)) {
            return new TeddyBear();
        } else if ("gameboy".equals(toyType)) {
            return new Gameboy();
        } else {
            throw new NoSuchToyException("No such toy: " + toyType);
        }
    }
    public List<GiftPaper> getPapers(int n) {
        List<GiftPaper> giftPapers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            GiftPaper paper = new GiftPaper();
            giftPapers.add(paper);
        }
        return giftPapers;
    }
}