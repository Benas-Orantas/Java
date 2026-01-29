package lt.techin.exercise;

import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PostStamp;

import java.util.*;

public class PhilatelistImpl implements Philatelist {

    private ArrayList<PostStamp> postStamps = new ArrayList<>();

    @Override
    public void addToCollection(PostStamp postStamp) {
        if (postStamp == null || postStamp.getName() == null) {
            throw new IllegalArgumentException("Cannot be null");
        } else if (postStamp.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Cannot be empty");
        } else if (!postStamps.contains(postStamp)) {
            postStamps.add(postStamp);
        }
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return postStamps.size();
    }

    @Override
    public void printAllPostStampNames() {
        postStamps.stream().map(PostStamp::getName).forEach(System.out::println);
    }

    @Override
    public void printPostStampsWithPriceGreaterThan(double v) {
        postStamps.stream().filter(p -> p.getMarketPrice() > v).map(PostStamp::getName).forEach(System.out::println);
    }

    @Override
    public boolean isPostStampInCollection(PostStamp postStamp) {
        return postStamps.contains(postStamp);
    }

    @Override
    public boolean isPostStampWithNameInCollection(String s) {
        return postStamps.stream().anyMatch(n -> n.getName().equals(s));
    }

    @Override
    public double calculateTotalMarketPrice() {
        return postStamps.stream().mapToDouble(PostStamp::getMarketPrice).sum();
    }

    @Override
    public double getAveragePostStampPrice() {
        return postStamps.stream().mapToDouble(PostStamp::getMarketPrice).average().orElse(0);
    }

    @Override
    public PostStamp getTheMostExpensivePostStampByMarketValue() {
        return postStamps.stream().max(Comparator.comparing(PostStamp::getMarketPrice)).orElse(null);
    }

    @Override
    public List<PostStamp> findPostStampsByNameContaining(String s) {
        return postStamps.stream().filter(n -> n.getName().contains(s)).toList();
    }

    @Override
    public List<PostStamp> getSortedPostStampsByName() {
        return postStamps.stream().sorted(Comparator.comparing(PostStamp::getName)).toList();
    }
}
