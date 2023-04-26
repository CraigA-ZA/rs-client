import lombok.RequiredArgsConstructor;
import shared.Constants;

import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

@RequiredArgsConstructor
public class RSAppletStub implements AppletStub {
    private final Map<String, String> config;

    @Override
    public boolean isActive()
    {
        return true;
    }

    @Override
    public URL getDocumentBase()
    {
        return getCodeBase();
    }

    @Override
    public URL getCodeBase()
    {
        try
        {
            return new URL(config.get(Constants.CODEBASE_PROPERTY));
        }
        catch (MalformedURLException ex)
        {
            return null;
        }
    }

    @Override
    public String getParameter(String name)
    {
        return config.get(name);
    }

    @Override
    public AppletContext getAppletContext()
    {
        return new AppletContext()
        {
            @Override
            public AudioClip getAudioClip(URL url)
            {
                return null;
            }

            @Override
            public Image getImage(URL url)
            {
                return null;
            }

            @Override
            public Applet getApplet(String name)
            {
                return null;
            }

            @Override
            public Enumeration<Applet> getApplets()
            {
                return null;
            }

            @Override
            public void showDocument(URL url)
            {
            }

            @Override
            public void showDocument(URL url, String target)
            {
                showDocument(url);
            }

            @Override
            public void showStatus(String status)
            {
            }

            @Override
            public void setStream(String key, InputStream stream) throws IOException
            {
            }

            @Override
            public InputStream getStream(String key)
            {
                return null;
            }

            @Override
            public Iterator<String> getStreamKeys()
            {
                return null;
            }
        };
    }

    @Override
    public void appletResize(int width, int height)
    {
    }
}