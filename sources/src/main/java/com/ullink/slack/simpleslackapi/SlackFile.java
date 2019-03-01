package com.ullink.slack.simpleslackapi;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SlackFile {

    private String id;
    private String name;
    private String title;
    private String plainText;
    private String preview;
    private String previewPlainText;
    private String mimeType;
    private String fileType;
    private String user;
    private String url;
    private String urlDownload;
    private String urlPrivate;
    private String urlPrivateDownload;
    private String thumb64;
    private String thumb80;
    private String thumb160;
    private String thumb360;
    private String thumb480;
    private String thumb720; 
    private Long imageExifRotation; 
    private Long originalW;
    private Long originalH;
    private String permalink;
    private String permalinkPublic;
    private String comment;
}
