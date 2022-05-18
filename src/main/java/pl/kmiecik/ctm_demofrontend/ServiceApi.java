package pl.kmiecik.ctm_demofrontend;

import java.util.List;

public interface ServiceApi {

    List<PackageDiscoveryDTO> findByPackageId(String packageId);
    void deleteByPackageIdDiscoveryID(String packageId,String discoveryId);
    void createNewDiscoveryForPackageId(String packageId);
}
