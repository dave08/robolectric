package org.robolectric.shadows;

import android.content.Context;
import android.media.MediaRouter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.TestRunners;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(TestRunners.WithDefaults.class)
public class ShadowMediaRouterTest {

  @Test
  public void testGetRouteCount() {
    MediaRouter medaiRouter = (MediaRouter) RuntimeEnvironment.application.getSystemService(Context.MEDIA_ROUTER_SERVICE);
    assertThat(medaiRouter.getRouteCount()).isEqualTo(0);
  }
}
