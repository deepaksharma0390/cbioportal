package org.cbioportal.persistence;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.cbioportal.model.ClinicalEventSample;
import org.cbioportal.model.Treatment;
import org.springframework.cache.annotation.Cacheable;

public interface TreatmentRepository {
    @Cacheable(cacheResolver = "generalRepositoryCacheResolver", condition = "@cacheEnabledConfig.getEnabled()")
    public Map<String, List<Treatment>> getTreatmentsByPatientId(List<String> sampleIds, List<String> studyIds, String key);

    @Cacheable(cacheResolver = "generalRepositoryCacheResolver", condition = "@cacheEnabledConfig.getEnabled()")
    public Map<String, List<ClinicalEventSample>> getSamplesByPatientId(List<String> sampleIds, List<String> studyIds);

    @Cacheable(cacheResolver = "generalRepositoryCacheResolver", condition = "@cacheEnabledConfig.getEnabled()")
    public Map<String, List<ClinicalEventSample>> getShallowSamplesByPatientId(List<String> sampleIds, List<String> studyIds);

    @Cacheable(cacheResolver = "generalRepositoryCacheResolver", condition = "@cacheEnabledConfig.getEnabled()")
    public Set<String> getAllUniqueTreatments(List<String> sampleIds, List<String> studyIds, String key);

    @Cacheable(cacheResolver = "generalRepositoryCacheResolver", condition = "@cacheEnabledConfig.getEnabled()")
    public Integer getTreatmentCount(List<String> studies, String key);

    @Cacheable(cacheResolver = "generalRepositoryCacheResolver", condition = "@cacheEnabledConfig.getEnabled()")
    public Integer getSampleCount(List<String> studies);
}
