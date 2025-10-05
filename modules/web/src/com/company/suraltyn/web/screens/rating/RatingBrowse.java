package com.company.suraltyn.web.screens.rating;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Rating;

@UiController("Rating.browse")
@UiDescriptor("rating-browse.xml")
@LookupComponent("ratingsTable")
@LoadDataBeforeShow
public class RatingBrowse extends StandardLookup<Rating> {
}