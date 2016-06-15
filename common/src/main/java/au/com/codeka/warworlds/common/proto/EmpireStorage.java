// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: star.proto at 145:1
package au.com.codeka.warworlds.common.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Float;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * Represents the details of an empire's stored goods in a star. For example, keeps track of stored
 * food, energy, minerals, etc, etc.
 */
public final class EmpireStorage extends Message<EmpireStorage, EmpireStorage.Builder> {
  public static final ProtoAdapter<EmpireStorage> ADAPTER = new ProtoAdapter_EmpireStorage();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_EMPIRE_ID = 0L;

  public static final Float DEFAULT_TOTAL_GOODS = 0.0f;

  public static final Float DEFAULT_TOTAL_MINERALS = 0.0f;

  public static final Float DEFAULT_TOTAL_ENERGY = 0.0f;

  public static final Float DEFAULT_GOODS_DELTA_PER_HOUR = 0.0f;

  public static final Float DEFAULT_MINERALS_DELTA_PER_HOUR = 0.0f;

  public static final Float DEFAULT_ENERGY_DELTA_PER_HOUR = 0.0f;

  public static final Float DEFAULT_MAX_GOODS = 0.0f;

  public static final Float DEFAULT_MAX_MINERALS = 0.0f;

  public static final Float DEFAULT_MAX_ENERGY = 0.0f;

  public static final Long DEFAULT_GOODS_ZERO_TIME = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long empire_id;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float total_goods;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float total_minerals;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float total_energy;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float goods_delta_per_hour;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float minerals_delta_per_hour;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float energy_delta_per_hour;

  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float max_goods;

  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float max_minerals;

  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float max_energy;

  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long goods_zero_time;

  public EmpireStorage(Long empire_id, Float total_goods, Float total_minerals, Float total_energy, Float goods_delta_per_hour, Float minerals_delta_per_hour, Float energy_delta_per_hour, Float max_goods, Float max_minerals, Float max_energy, Long goods_zero_time) {
    this(empire_id, total_goods, total_minerals, total_energy, goods_delta_per_hour, minerals_delta_per_hour, energy_delta_per_hour, max_goods, max_minerals, max_energy, goods_zero_time, ByteString.EMPTY);
  }

  public EmpireStorage(Long empire_id, Float total_goods, Float total_minerals, Float total_energy, Float goods_delta_per_hour, Float minerals_delta_per_hour, Float energy_delta_per_hour, Float max_goods, Float max_minerals, Float max_energy, Long goods_zero_time, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.empire_id = empire_id;
    this.total_goods = total_goods;
    this.total_minerals = total_minerals;
    this.total_energy = total_energy;
    this.goods_delta_per_hour = goods_delta_per_hour;
    this.minerals_delta_per_hour = minerals_delta_per_hour;
    this.energy_delta_per_hour = energy_delta_per_hour;
    this.max_goods = max_goods;
    this.max_minerals = max_minerals;
    this.max_energy = max_energy;
    this.goods_zero_time = goods_zero_time;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.empire_id = empire_id;
    builder.total_goods = total_goods;
    builder.total_minerals = total_minerals;
    builder.total_energy = total_energy;
    builder.goods_delta_per_hour = goods_delta_per_hour;
    builder.minerals_delta_per_hour = minerals_delta_per_hour;
    builder.energy_delta_per_hour = energy_delta_per_hour;
    builder.max_goods = max_goods;
    builder.max_minerals = max_minerals;
    builder.max_energy = max_energy;
    builder.goods_zero_time = goods_zero_time;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof EmpireStorage)) return false;
    EmpireStorage o = (EmpireStorage) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(empire_id, o.empire_id)
        && Internal.equals(total_goods, o.total_goods)
        && Internal.equals(total_minerals, o.total_minerals)
        && Internal.equals(total_energy, o.total_energy)
        && Internal.equals(goods_delta_per_hour, o.goods_delta_per_hour)
        && Internal.equals(minerals_delta_per_hour, o.minerals_delta_per_hour)
        && Internal.equals(energy_delta_per_hour, o.energy_delta_per_hour)
        && Internal.equals(max_goods, o.max_goods)
        && Internal.equals(max_minerals, o.max_minerals)
        && Internal.equals(max_energy, o.max_energy)
        && Internal.equals(goods_zero_time, o.goods_zero_time);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (empire_id != null ? empire_id.hashCode() : 0);
      result = result * 37 + (total_goods != null ? total_goods.hashCode() : 0);
      result = result * 37 + (total_minerals != null ? total_minerals.hashCode() : 0);
      result = result * 37 + (total_energy != null ? total_energy.hashCode() : 0);
      result = result * 37 + (goods_delta_per_hour != null ? goods_delta_per_hour.hashCode() : 0);
      result = result * 37 + (minerals_delta_per_hour != null ? minerals_delta_per_hour.hashCode() : 0);
      result = result * 37 + (energy_delta_per_hour != null ? energy_delta_per_hour.hashCode() : 0);
      result = result * 37 + (max_goods != null ? max_goods.hashCode() : 0);
      result = result * 37 + (max_minerals != null ? max_minerals.hashCode() : 0);
      result = result * 37 + (max_energy != null ? max_energy.hashCode() : 0);
      result = result * 37 + (goods_zero_time != null ? goods_zero_time.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (empire_id != null) builder.append(", empire_id=").append(empire_id);
    if (total_goods != null) builder.append(", total_goods=").append(total_goods);
    if (total_minerals != null) builder.append(", total_minerals=").append(total_minerals);
    if (total_energy != null) builder.append(", total_energy=").append(total_energy);
    if (goods_delta_per_hour != null) builder.append(", goods_delta_per_hour=").append(goods_delta_per_hour);
    if (minerals_delta_per_hour != null) builder.append(", minerals_delta_per_hour=").append(minerals_delta_per_hour);
    if (energy_delta_per_hour != null) builder.append(", energy_delta_per_hour=").append(energy_delta_per_hour);
    if (max_goods != null) builder.append(", max_goods=").append(max_goods);
    if (max_minerals != null) builder.append(", max_minerals=").append(max_minerals);
    if (max_energy != null) builder.append(", max_energy=").append(max_energy);
    if (goods_zero_time != null) builder.append(", goods_zero_time=").append(goods_zero_time);
    return builder.replace(0, 2, "EmpireStorage{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<EmpireStorage, Builder> {
    public Long empire_id;

    public Float total_goods;

    public Float total_minerals;

    public Float total_energy;

    public Float goods_delta_per_hour;

    public Float minerals_delta_per_hour;

    public Float energy_delta_per_hour;

    public Float max_goods;

    public Float max_minerals;

    public Float max_energy;

    public Long goods_zero_time;

    public Builder() {
    }

    public Builder empire_id(Long empire_id) {
      this.empire_id = empire_id;
      return this;
    }

    public Builder total_goods(Float total_goods) {
      this.total_goods = total_goods;
      return this;
    }

    public Builder total_minerals(Float total_minerals) {
      this.total_minerals = total_minerals;
      return this;
    }

    public Builder total_energy(Float total_energy) {
      this.total_energy = total_energy;
      return this;
    }

    public Builder goods_delta_per_hour(Float goods_delta_per_hour) {
      this.goods_delta_per_hour = goods_delta_per_hour;
      return this;
    }

    public Builder minerals_delta_per_hour(Float minerals_delta_per_hour) {
      this.minerals_delta_per_hour = minerals_delta_per_hour;
      return this;
    }

    public Builder energy_delta_per_hour(Float energy_delta_per_hour) {
      this.energy_delta_per_hour = energy_delta_per_hour;
      return this;
    }

    public Builder max_goods(Float max_goods) {
      this.max_goods = max_goods;
      return this;
    }

    public Builder max_minerals(Float max_minerals) {
      this.max_minerals = max_minerals;
      return this;
    }

    public Builder max_energy(Float max_energy) {
      this.max_energy = max_energy;
      return this;
    }

    public Builder goods_zero_time(Long goods_zero_time) {
      this.goods_zero_time = goods_zero_time;
      return this;
    }

    @Override
    public EmpireStorage build() {
      return new EmpireStorage(empire_id, total_goods, total_minerals, total_energy, goods_delta_per_hour, minerals_delta_per_hour, energy_delta_per_hour, max_goods, max_minerals, max_energy, goods_zero_time, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_EmpireStorage extends ProtoAdapter<EmpireStorage> {
    ProtoAdapter_EmpireStorage() {
      super(FieldEncoding.LENGTH_DELIMITED, EmpireStorage.class);
    }

    @Override
    public int encodedSize(EmpireStorage value) {
      return (value.empire_id != null ? ProtoAdapter.INT64.encodedSizeWithTag(1, value.empire_id) : 0)
          + (value.total_goods != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, value.total_goods) : 0)
          + (value.total_minerals != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, value.total_minerals) : 0)
          + (value.total_energy != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, value.total_energy) : 0)
          + (value.goods_delta_per_hour != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(5, value.goods_delta_per_hour) : 0)
          + (value.minerals_delta_per_hour != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(6, value.minerals_delta_per_hour) : 0)
          + (value.energy_delta_per_hour != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(7, value.energy_delta_per_hour) : 0)
          + (value.max_goods != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(8, value.max_goods) : 0)
          + (value.max_minerals != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(9, value.max_minerals) : 0)
          + (value.max_energy != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(10, value.max_energy) : 0)
          + (value.goods_zero_time != null ? ProtoAdapter.INT64.encodedSizeWithTag(11, value.goods_zero_time) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, EmpireStorage value) throws IOException {
      if (value.empire_id != null) ProtoAdapter.INT64.encodeWithTag(writer, 1, value.empire_id);
      if (value.total_goods != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 2, value.total_goods);
      if (value.total_minerals != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 3, value.total_minerals);
      if (value.total_energy != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 4, value.total_energy);
      if (value.goods_delta_per_hour != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 5, value.goods_delta_per_hour);
      if (value.minerals_delta_per_hour != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 6, value.minerals_delta_per_hour);
      if (value.energy_delta_per_hour != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 7, value.energy_delta_per_hour);
      if (value.max_goods != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 8, value.max_goods);
      if (value.max_minerals != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 9, value.max_minerals);
      if (value.max_energy != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 10, value.max_energy);
      if (value.goods_zero_time != null) ProtoAdapter.INT64.encodeWithTag(writer, 11, value.goods_zero_time);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public EmpireStorage decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.empire_id(ProtoAdapter.INT64.decode(reader)); break;
          case 2: builder.total_goods(ProtoAdapter.FLOAT.decode(reader)); break;
          case 3: builder.total_minerals(ProtoAdapter.FLOAT.decode(reader)); break;
          case 4: builder.total_energy(ProtoAdapter.FLOAT.decode(reader)); break;
          case 5: builder.goods_delta_per_hour(ProtoAdapter.FLOAT.decode(reader)); break;
          case 6: builder.minerals_delta_per_hour(ProtoAdapter.FLOAT.decode(reader)); break;
          case 7: builder.energy_delta_per_hour(ProtoAdapter.FLOAT.decode(reader)); break;
          case 8: builder.max_goods(ProtoAdapter.FLOAT.decode(reader)); break;
          case 9: builder.max_minerals(ProtoAdapter.FLOAT.decode(reader)); break;
          case 10: builder.max_energy(ProtoAdapter.FLOAT.decode(reader)); break;
          case 11: builder.goods_zero_time(ProtoAdapter.INT64.decode(reader)); break;
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
    public EmpireStorage redact(EmpireStorage value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
