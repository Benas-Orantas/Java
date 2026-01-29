package lt.techin;

import lt.vtvpmc.java.postoffice.IllegalPackageException;
import lt.vtvpmc.java.postoffice.Package;
import lt.vtvpmc.java.postoffice.PostOffice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PostOfficeImpl implements PostOffice {

    private List<Package> packages = new ArrayList<>();

    @Override
    public void postPackage(Package aPackage) throws IllegalPackageException {
        if (aPackage.getPackageCode() == null || aPackage.getOwner() == null) {
            throw new IllegalPackageException("Package code nor owner can be null");
        } else if (aPackage.getOwner().trim().equals("")) {
            throw new IllegalPackageException("Cannot post package without owner");
        } else if (aPackage.getPackageCode().trim().equals("")) {
            throw new IllegalPackageException("Cannot post package without package code");
        } else {
            packages.add(aPackage);
        }
    }

    @Override
    public long numberOfPackagesForOwner(String s) {
        return packages.stream().filter(o -> o.getOwner().equals(s)).count();
    }

    @Override
    public Package retrievePackage(String s) {
        Package aPackage = packages.stream().filter(p -> p.getPackageCode().equals(s)).findAny().orElse(null);
        packages.clear();
        return aPackage;
    }
}
