package com.example.bt1.service;

import com.example.bt1.model.MailConfig;

public interface IMailConfigService {
    public MailConfig getConfig();

    public void updateConfig(MailConfig newConfig);
}
