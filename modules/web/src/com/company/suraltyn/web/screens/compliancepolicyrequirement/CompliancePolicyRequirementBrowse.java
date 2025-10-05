package com.company.suraltyn.web.screens.compliancepolicyrequirement;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.CompliancePolicyRequirement;

@UiController("CompliancePolicyRequirement.browse")
@UiDescriptor("compliance-policy-requirement-browse.xml")
@LookupComponent("compliancePolicyRequirementsTable")
@LoadDataBeforeShow
public class CompliancePolicyRequirementBrowse extends StandardLookup<CompliancePolicyRequirement> {
}