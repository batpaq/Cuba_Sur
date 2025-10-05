package com.company.suraltyn.web.screens.rating;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Rating;

@UiController("Rating.edit")
@UiDescriptor("rating-edit.xml")
@EditedEntityContainer("ratingDc")
@LoadDataBeforeShow
public class RatingEdit extends StandardEditor<Rating> {
}