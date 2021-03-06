// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: au/com/codeka/warworlds/common/proto/account.proto at 78:1
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
 * This is sent to the /login endpoint in order to log in to the server.
 */
public final class LoginRequest extends Message<LoginRequest, LoginRequest.Builder> {
  public static final ProtoAdapter<LoginRequest> ADAPTER = new ProtoAdapter_LoginRequest();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_COOKIE = "";

  /**
   * Your login cookie. Required.
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String cookie;

  /**
   * The DeviceInfo of the device you're logging in from.
   */
  @WireField(
      tag = 2,
      adapter = "au.com.codeka.warworlds.common.proto.DeviceInfo#ADAPTER"
  )
  public final DeviceInfo device_info;

  public LoginRequest(String cookie, DeviceInfo device_info) {
    this(cookie, device_info, ByteString.EMPTY);
  }

  public LoginRequest(String cookie, DeviceInfo device_info, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.cookie = cookie;
    this.device_info = device_info;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.cookie = cookie;
    builder.device_info = device_info;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof LoginRequest)) return false;
    LoginRequest o = (LoginRequest) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(cookie, o.cookie)
        && Internal.equals(device_info, o.device_info);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (cookie != null ? cookie.hashCode() : 0);
      result = result * 37 + (device_info != null ? device_info.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (cookie != null) builder.append(", cookie=").append(cookie);
    if (device_info != null) builder.append(", device_info=").append(device_info);
    return builder.replace(0, 2, "LoginRequest{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<LoginRequest, Builder> {
    public String cookie;

    public DeviceInfo device_info;

    public Builder() {
    }

    /**
     * Your login cookie. Required.
     */
    public Builder cookie(String cookie) {
      this.cookie = cookie;
      return this;
    }

    /**
     * The DeviceInfo of the device you're logging in from.
     */
    public Builder device_info(DeviceInfo device_info) {
      this.device_info = device_info;
      return this;
    }

    @Override
    public LoginRequest build() {
      return new LoginRequest(cookie, device_info, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_LoginRequest extends ProtoAdapter<LoginRequest> {
    ProtoAdapter_LoginRequest() {
      super(FieldEncoding.LENGTH_DELIMITED, LoginRequest.class);
    }

    @Override
    public int encodedSize(LoginRequest value) {
      return (value.cookie != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.cookie) : 0)
          + (value.device_info != null ? DeviceInfo.ADAPTER.encodedSizeWithTag(2, value.device_info) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, LoginRequest value) throws IOException {
      if (value.cookie != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.cookie);
      if (value.device_info != null) DeviceInfo.ADAPTER.encodeWithTag(writer, 2, value.device_info);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public LoginRequest decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.cookie(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.device_info(DeviceInfo.ADAPTER.decode(reader)); break;
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
    public LoginRequest redact(LoginRequest value) {
      Builder builder = value.newBuilder();
      if (builder.device_info != null) builder.device_info = DeviceInfo.ADAPTER.redact(builder.device_info);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
