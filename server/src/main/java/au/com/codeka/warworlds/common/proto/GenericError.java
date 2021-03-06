// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: au/com/codeka/warworlds/common/proto/common.proto at 5:1
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
 * Some methods will return this in the case of an error, so we can display a meaningful error
 * to the user.
 */
public final class GenericError extends Message<GenericError, GenericError.Builder> {
  public static final ProtoAdapter<GenericError> ADAPTER = new ProtoAdapter_GenericError();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ERROR_MESSAGE = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String error_message;

  public GenericError(String error_message) {
    this(error_message, ByteString.EMPTY);
  }

  public GenericError(String error_message, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.error_message = error_message;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.error_message = error_message;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GenericError)) return false;
    GenericError o = (GenericError) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(error_message, o.error_message);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (error_message != null ? error_message.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (error_message != null) builder.append(", error_message=").append(error_message);
    return builder.replace(0, 2, "GenericError{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GenericError, Builder> {
    public String error_message;

    public Builder() {
    }

    public Builder error_message(String error_message) {
      this.error_message = error_message;
      return this;
    }

    @Override
    public GenericError build() {
      return new GenericError(error_message, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GenericError extends ProtoAdapter<GenericError> {
    ProtoAdapter_GenericError() {
      super(FieldEncoding.LENGTH_DELIMITED, GenericError.class);
    }

    @Override
    public int encodedSize(GenericError value) {
      return (value.error_message != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.error_message) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GenericError value) throws IOException {
      if (value.error_message != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.error_message);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GenericError decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.error_message(ProtoAdapter.STRING.decode(reader)); break;
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
    public GenericError redact(GenericError value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
