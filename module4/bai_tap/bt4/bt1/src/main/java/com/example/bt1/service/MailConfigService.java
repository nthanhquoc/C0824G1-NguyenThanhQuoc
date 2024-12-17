package com.example.bt1.service;


import com.example.bt1.model.MailConfig;
import org.springframework.stereotype.Service;

@Service
public class MailConfigService implements IMailConfigService {
    private MailConfig mailConfig;

    public MailConfigService() {
        this.mailConfig = new MailConfig();
    }

    public MailConfig getConfig() {
        return mailConfig;
    }

    public void updateConfig(MailConfig newConfig) {
        this.mailConfig.setLanguage(newConfig.getLanguage());
        this.mailConfig.setPageSize(newConfig.getPageSize());
        this.mailConfig.setSpamFilter(newConfig.isSpamFilter());
        this.mailConfig.setSignature(newConfig.getSignature());
    }
}