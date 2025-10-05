package com.company.suraltyn.web.screens.compliancepolicyrequirement;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.CompliancePolicyRequirement;

@UiController("CompliancePolicyRequirement.edit")
@UiDescriptor("compliance-policy-requirement-edit.xml")
@EditedEntityContainer("compliancePolicyRequirementDc")
@LoadDataBeforeShow
public class CompliancePolicyRequirementEdit extends StandardEditor<CompliancePolicyRequirement> {
}