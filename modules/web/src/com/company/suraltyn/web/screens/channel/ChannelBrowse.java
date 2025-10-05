package com.company.suraltyn.web.screens.channel;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Channel;

@UiController("suraltyn$Channel.browse")
@UiDescriptor("channel-browse.xml")
@LookupComponent("channelsTable")
@LoadDataBeforeShow
public class ChannelBrowse extends StandardLookup<Channel> {
}