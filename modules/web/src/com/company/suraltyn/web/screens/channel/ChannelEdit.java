package com.company.suraltyn.web.screens.channel;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Channel;

@UiController("suraltyn$Channel.edit")
@UiDescriptor("channel-edit.xml")
@EditedEntityContainer("channelDc")
@LoadDataBeforeShow
public class ChannelEdit extends StandardEditor<Channel> {
}