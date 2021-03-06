// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: au/com/codeka/warworlds/common/proto/admin.proto at 21:1
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
import java.util.List;
import okio.ByteString;

/**
 * An admin user is used by the backend to do authentication and authorization.
 */
public final class AdminUser extends Message<AdminUser, AdminUser.Builder> {
  public static final ProtoAdapter<AdminUser> ADAPTER = new ProtoAdapter_AdminUser();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_EMAIL_ADDR = "";

  /**
   * The email address of the user. We authenticate using google login.
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String email_addr;

  /**
   * A list of the roles this user is in.
   */
  @WireField(
      tag = 2,
      adapter = "au.com.codeka.warworlds.common.proto.AdminRole#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<AdminRole> roles;

  public AdminUser(String email_addr, List<AdminRole> roles) {
    this(email_addr, roles, ByteString.EMPTY);
  }

  public AdminUser(String email_addr, List<AdminRole> roles, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.email_addr = email_addr;
    this.roles = Internal.immutableCopyOf("roles", roles);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.email_addr = email_addr;
    builder.roles = Internal.copyOf("roles", roles);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AdminUser)) return false;
    AdminUser o = (AdminUser) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(email_addr, o.email_addr)
        && Internal.equals(roles, o.roles);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (email_addr != null ? email_addr.hashCode() : 0);
      result = result * 37 + (roles != null ? roles.hashCode() : 1);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (email_addr != null) builder.append(", email_addr=").append(email_addr);
    if (roles != null) builder.append(", roles=").append(roles);
    return builder.replace(0, 2, "AdminUser{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AdminUser, Builder> {
    public String email_addr;

    public List<AdminRole> roles;

    public Builder() {
      roles = Internal.newMutableList();
    }

    /**
     * The email address of the user. We authenticate using google login.
     */
    public Builder email_addr(String email_addr) {
      this.email_addr = email_addr;
      return this;
    }

    /**
     * A list of the roles this user is in.
     */
    public Builder roles(List<AdminRole> roles) {
      Internal.checkElementsNotNull(roles);
      this.roles = roles;
      return this;
    }

    @Override
    public AdminUser build() {
      return new AdminUser(email_addr, roles, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AdminUser extends ProtoAdapter<AdminUser> {
    ProtoAdapter_AdminUser() {
      super(FieldEncoding.LENGTH_DELIMITED, AdminUser.class);
    }

    @Override
    public int encodedSize(AdminUser value) {
      return (value.email_addr != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.email_addr) : 0)
          + AdminRole.ADAPTER.asRepeated().encodedSizeWithTag(2, value.roles)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AdminUser value) throws IOException {
      if (value.email_addr != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.email_addr);
      if (value.roles != null) AdminRole.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.roles);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AdminUser decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.email_addr(ProtoAdapter.STRING.decode(reader)); break;
          case 2: {
            try {
              builder.roles.add(AdminRole.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
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
    public AdminUser redact(AdminUser value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
