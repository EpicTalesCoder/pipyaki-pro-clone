import javax.microedition.media.Control;
import javax.microedition.media.protocol.DataSource;
import javax.microedition.media.protocol.SourceStream;

public final class sc extends DataSource {
   private String b;
   private String c;
   private z[] d;
   public int e;
   public int f;

   public sc(String var1, String var2) {
      super(var1);
      this.c = var1;
      this.b = var2;
      this.d = new z[1];
      this.d[0] = new z(this.c, this.b);
   }

   public final void connect() {
   }

   public final void disconnect() {
   }

   public final void start() {
   }

   public final void stop() {
   }

   public final Control getControl(String var1) {
      return null;
   }

   public final Control[] getControls() {
      return null;
   }

   public final SourceStream[] getStreams() {
      return this.d;
   }

   public final String getContentType() {
      return this.b;
   }

   public final void b() {
      this.d[0].b = 0L;
   }
}
