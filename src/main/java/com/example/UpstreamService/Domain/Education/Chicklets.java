package com.example.UpstreamService.Domain.Education;
import com.example.UpstreamService.Domain.Education.Institution;
import com.example.UpstreamService.Domain.Education.Qualification;
import com.example.UpstreamService.Domain.Education.Summary;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Chicklets {
    Institution institution;
    Qualification qualification;
    Summary summary;

    /*public Chicklets(Institution institution, Qualification qualification, Summary summary) {
        this.institution = institution;
        this.qualification = qualification;
        this.summary = summary;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }*/
}
