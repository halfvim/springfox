package springfox.documentation.builders;

import com.google.common.base.Optional;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.google.common.collect.Lists.*;
import static com.google.common.collect.Maps.*;
import static com.google.common.collect.Sets.*;

public class BuilderDefaults {
  private BuilderDefaults() {
    throw new UnsupportedOperationException();
  }

  public static <T> T defaultIfAbsent(T newValue, T defaultValue) {
      return Optional.fromNullable(newValue)
            .or(Optional.fromNullable(defaultValue))
            .orNull();
  }

  public static <T> List<T> nullToEmptyList(List<T> newValue) {
    if (newValue == null) {
      return newArrayList();
    }
    return newValue;
  }

  public static <K, V> Map<K, V> nullToEmptyMap(Map<K, V> newValue) {
    if (newValue == null) {
      return newHashMap();
    }
    return newValue;
  }

  public static <T> Set<T> nullToEmptySet(Set<T> newValue) {
    if (newValue == null) {
      return newHashSet();
    }
    return newValue;
  }
}