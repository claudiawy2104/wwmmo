// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: au/com/codeka/warworlds/common/proto/account.proto at 116:1
package au.com.codeka.warworlds.common.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * Contains details about a device, such as it's ID, model etc. Also contains details about the
 * device's GCM registration (so we can send it GCM messages).
 */
public final class DeviceInfo extends Message<DeviceInfo, DeviceInfo.Builder> {
  public static final ProtoAdapter<DeviceInfo> ADAPTER = new ProtoAdapter_DeviceInfo();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_DEVICE_ID = "";

  public static final String DEFAULT_DEVICE_MODEL = "";

  public static final String DEFAULT_DEVICE_MANUFACTURER = "";

  public static final String DEFAULT_DEVICE_BUILD = "";

  public static final String DEFAULT_DEVICE_VERSION = "";

  /**
   * The identifier of the device. You can have multiple accounts on one device, this
   * will then refer to the device itself.
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String device_id;

  /**
   * The value of android.os.Build.MODEL for this device
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String device_model;

  /**
   * The value of android.os.Build.MANUFACTURER for this device
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String device_manufacturer;

  /**
   * The value of android.os.Build.DISPLAY for this device
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String device_build;

  /**
   * The value of android.os.Build.VERSION.RELEASE for this device (note that this can
   * change if you upgrade the OS without re-registering your device!)
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String device_version;

  public DeviceInfo(String device_id, String device_model, String device_manufacturer, String device_build, String device_version) {
    this(device_id, device_model, device_manufacturer, device_build, device_version, ByteString.EMPTY);
  }

  public DeviceInfo(String device_id, String device_model, String device_manufacturer, String device_build, String device_version, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.device_id = device_id;
    this.device_model = device_model;
    this.device_manufacturer = device_manufacturer;
    this.device_build = device_build;
    this.device_version = device_version;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.device_id = device_id;
    builder.device_model = device_model;
    builder.device_manufacturer = device_manufacturer;
    builder.device_build = device_build;
    builder.device_version = device_version;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DeviceInfo)) return false;
    DeviceInfo o = (DeviceInfo) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(device_id, o.device_id)
        && Internal.equals(device_model, o.device_model)
        && Internal.equals(device_manufacturer, o.device_manufacturer)
        && Internal.equals(device_build, o.device_build)
        && Internal.equals(device_version, o.device_version);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (device_id != null ? device_id.hashCode() : 0);
      result = result * 37 + (device_model != null ? device_model.hashCode() : 0);
      result = result * 37 + (device_manufacturer != null ? device_manufacturer.hashCode() : 0);
      result = result * 37 + (device_build != null ? device_build.hashCode() : 0);
      result = result * 37 + (device_version != null ? device_version.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (device_id != null) builder.append(", device_id=").append(device_id);
    if (device_model != null) builder.append(", device_model=").append(device_model);
    if (device_manufacturer != null) builder.append(", device_manufacturer=").append(device_manufacturer);
    if (device_build != null) builder.append(", device_build=").append(device_build);
    if (device_version != null) builder.append(", device_version=").append(device_version);
    return builder.replace(0, 2, "DeviceInfo{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<DeviceInfo, Builder> {
    public String device_id;

    public String device_model;

    public String device_manufacturer;

    public String device_build;

    public String device_version;

    public Builder() {
    }

    /**
     * The identifier of the device. You can have multiple accounts on one device, this
     * will then refer to the device itself.
     */
    public Builder device_id(String device_id) {
      this.device_id = device_id;
      return this;
    }

    /**
     * The value of android.os.Build.MODEL for this device
     */
    public Builder device_model(String device_model) {
      this.device_model = device_model;
      return this;
    }

    /**
     * The value of android.os.Build.MANUFACTURER for this device
     */
    public Builder device_manufacturer(String device_manufacturer) {
      this.device_manufacturer = device_manufacturer;
      return this;
    }

    /**
     * The value of android.os.Build.DISPLAY for this device
     */
    public Builder device_build(String device_build) {
      this.device_build = device_build;
      return this;
    }

    /**
     * The value of android.os.Build.VERSION.RELEASE for this device (note that this can
     * change if you upgrade the OS without re-registering your device!)
     */
    public Builder device_version(String device_version) {
      this.device_version = device_version;
      return this;
    }

    @Override
    public DeviceInfo build() {
      return new DeviceInfo(device_id, device_model, device_manufacturer, device_build, device_version, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_DeviceInfo extends ProtoAdapter<DeviceInfo> {
    ProtoAdapter_DeviceInfo() {
      super(FieldEncoding.LENGTH_DELIMITED, DeviceInfo.class);
    }

    @Override
    public int encodedSize(DeviceInfo value) {
      return (value.device_id != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.device_id) : 0)
          + (value.device_model != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.device_model) : 0)
          + (value.device_manufacturer != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.device_manufacturer) : 0)
          + (value.device_build != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.device_build) : 0)
          + (value.device_version != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.device_version) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, DeviceInfo value) throws IOException {
      if (value.device_id != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.device_id);
      if (value.device_model != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.device_model);
      if (value.device_manufacturer != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.device_manufacturer);
      if (value.device_build != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.device_build);
      if (value.device_version != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.device_version);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public DeviceInfo decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.device_id(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.device_model(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.device_manufacturer(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.device_build(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.device_version(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public DeviceInfo redact(DeviceInfo value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
